package com.greetingapp.greetingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Greetings")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Greeting {
    @Id
    private int id;
    private String masage;


    public Greeting(int id, String masage) {
		super();
		this.id = id;
		this.masage = masage;
	}


	@Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", masage='" + masage + '\'' +
                '}';
    }
}
