package com.travelneer.api;

import com.travelneer.hateoas.PostResource;

import java.util.List;

import com.travelneer.jooq.tables.pojos.Post;
import com.travelneer.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Youssef
 */
@RestController
@CrossOrigin(origins = { "http://localhost:3000" })
@RequestMapping(value = "/api")
public class PostsController {

	private final PostService postService;

	@Autowired
	public PostsController(PostService postService) {
		this.postService = postService;
	}

	@RequestMapping(value = "/feed", method = RequestMethod.GET)
	public ResponseEntity<?> getFeed() {

		try {
			List<PostResource> posts = postService.getFeed();

			return new ResponseEntity<>(posts, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/feed", method = RequestMethod.POST,
			headers = {"Content-type=application/json"})
	public ResponseEntity<?> newPost(@RequestBody Post post) {

		try {
			postService.create(post);

            return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/posts/{postId}", method = RequestMethod.GET)
	public ResponseEntity<?> getPost(@PathVariable("postId") int postId) {

		try {
			var postResource = new PostResource(postService.getPost(postId));

			return new ResponseEntity<>(postResource, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
