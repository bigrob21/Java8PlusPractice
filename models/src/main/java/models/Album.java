package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Album {
	private String title;
	private LocalDate release;
	@Builder.Default  List<Artist> artists = new ArrayList<>();
	@Builder.Default  List<Track> tracks = new ArrayList<>();
}
