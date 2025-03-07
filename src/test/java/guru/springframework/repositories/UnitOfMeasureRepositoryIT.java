package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findUnitOfMeasureByUomTeaspoon() {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findUnitOfMeasureByUom("Teaspoon");
        assertEquals("Teaspoon", uomOptional.get().getUom());
    }

    @Test
    public void findUnitOfMeasureByUomCup() {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findUnitOfMeasureByUom("Cup");
        assertEquals("Cup", uomOptional.get().getUom());
    }
}