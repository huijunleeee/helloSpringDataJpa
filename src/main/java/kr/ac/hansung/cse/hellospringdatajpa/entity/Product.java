package kr.ac.hansung.cse.hellospringdatajpa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="제품 이름을 입력해주세요.")
    private String name;

    @NotEmpty(message="제품 브랜드를 입력해주세요.")
    private String brand;

    @NotEmpty(message="제품 제조지를 입력해주세요.")
    private String madeIn;

    @Min(value = 0, message = "가격은 0 이상이어야 합니다.")
    private double price;

    public Product(String name, String brand, String madeIn, double price) {
        this.name = name;
        this.brand = brand;
        this.madeIn = madeIn;
        this.price = price;
    }
}