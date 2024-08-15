package com.demo.singleclass;

import com.demo.singleclass.model.SingleTable.BlogType;
import com.demo.singleclass.model.SingleTable.Book;
import com.demo.singleclass.model.SingleTable.Publisher;
import com.demo.singleclass.repository.PublisherRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SingleClassApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext config =
				SpringApplication.run(SingleClassApplication.class, args);

		PublisherRepo bookRepo = config.getBean("bookRepo", PublisherRepo.class);
		PublisherRepo blogRepo = config.getBean("blogRepo", PublisherRepo.class);

		// Reading the configuration value. This is not required.
		PropertyReader reader = config.getBean("propertyReader", PropertyReader.class);
		String type = reader.getType();

		switch (type) {
			case "SINGLE-CLASS":

				Publisher book = new Book(200);
				book.setAuthor("Zahid");

				bookRepo.save(book);

				Publisher blog = new BlogType("JPA Inheritance", "Single table inheritance");
				blog.setAuthor("Safia");
				blogRepo.save(blog);

				break;

			case "TABLE-PER-CLASS":


				break;
			case "JOINED-CLASS":

				break;
			case "MAPPED-SUPPER-CLASS":
				break;
			default:
				throw new RuntimeException("Unsupported type: " + type);

		}



	}
}
