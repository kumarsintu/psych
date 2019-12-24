package com.psych.game.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "content_writers")
public class ContentWriter extends Employee {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToMany
    @Getter
    @Setter
    List<Question> editedQuestions;
}