package io.github.wagner.todo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo implements Serializable{

	
	private static final long serialVersionUID = -2538767069507937506L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String description;
	
	@Column
	private Boolean done;
	
	@Column
	@JsonFormat(pattern="dd/MM/yyyy  HH:mm")
	private LocalDateTime createDate;
	
	@Column
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private LocalDateTime doneDate;

	@PrePersist
	public void beforeSave() {
		setCreateDate(LocalDateTime.now());
	}
	
	
	
}
