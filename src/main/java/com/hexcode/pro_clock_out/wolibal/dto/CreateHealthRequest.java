package com.hexcode.pro_clock_out.wolibal.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateHealthRequest {
    @Min(0) @Max(7)
    private int cardioFrequency;
    @Min(0) @Max(24)
    private double cardioTime;
    @Min(0) @Max(7)
    private int strengthFrequency;
    @Min(0) @Max(24)
    private double strengthTime;
    @Min(1) @Max(9)
    private int dietQuality;
    @Min(1) @Max(9)
    private int healthSatisfaction;
}