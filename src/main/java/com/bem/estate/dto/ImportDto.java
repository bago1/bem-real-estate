package com.bem.estate.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class ImportDto {
    String name;
    Long otherTableId;
}
