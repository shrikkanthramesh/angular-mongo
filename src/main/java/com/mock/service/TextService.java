package com.mock.service;

import java.util.List;

import com.mock.domain.TextFields;

public interface TextService {
	public List<TextFields> getAllObjects();
	/**
	 * Saves a Textfield pair.
	 */
	public void saveObject(TextFields textFields);

	/**
	 * Gets a {@link Tree} for a particular id.
	 */
	public TextFields getObject(String id);

	
}
