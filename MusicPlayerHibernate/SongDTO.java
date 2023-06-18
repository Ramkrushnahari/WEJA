package com.jspider.musicplayerhibernate.dto;


import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class SongDTO {
	@Id
	
	private int id;
	private String songName;
	private String singerName;
	private String moveName;
	private double duration;
	
	
	@Override
	public String toString() {
		return "Song id:" + id + " \nsongName:" + songName + " \nsingerName:" + singerName + " \nmoveName=" + moveName
				+ "\nduration=" + duration;
	}


}
