package com.mock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mock.domain.TextFields;
import com.mock.service.TextService;

@Service
public class TextServiceImpl implements TextService {
	
	@Autowired
	private MongoOperations mongoOperations;
	
	public static final String COLLECTION_NAME = "textfield";
	
	
	@Override
	public List<TextFields> getAllObjects() {
		
		return mongoOperations.findAll(TextFields.class, COLLECTION_NAME);
	}

	@Override
	public void saveObject(TextFields textFields) {
		mongoOperations.save(textFields, COLLECTION_NAME);

	}

	@Override
	public TextFields getObject(String id) {
		
		return mongoOperations.findOne(Query.query(Criteria.where("_id").is(id)),
		        TextFields.class,COLLECTION_NAME
		    );
	}

}
