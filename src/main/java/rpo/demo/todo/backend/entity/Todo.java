package rpo.demo.todo.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Boolean status;

    @NotEmpty
    @NotBlank
    @Column(nullable = false)
    private String title;

    @Column
    private String description;

    @Column
    private LocalDateTime dateDone;
}
