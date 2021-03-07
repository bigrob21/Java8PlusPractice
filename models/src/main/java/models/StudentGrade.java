package models;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class StudentGrade {
	private @NonNull String id;
	private @NonNull String name;
	private String grade;
}
