package guru.springframwork.msscbeerservice.Model;

import guru.springframwork.msscbeerservice.Enums.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private String beerName;
    private String upc;
    private Integer version;
    private OffsetDateTime createdData;
    private OffsetDateTime updatedData;
    private BigDecimal price;
    private Integer quantityOnHand;
    private BeerStyleEnum beerStyle;
}
