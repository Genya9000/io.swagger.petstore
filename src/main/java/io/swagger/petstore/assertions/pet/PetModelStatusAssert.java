package io.swagger.petstore.assertions.pet;

import io.swagger.petstore.models.pet.PetModel;

/**
 * {@link PetModel.Status} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractPetModelStatusAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class PetModelStatusAssert extends AbstractPetModelStatusAssert<PetModelStatusAssert, PetModel.Status> {

  /**
   * Creates a new <code>{@link PetModelStatusAssert}</code> to make assertions on actual PetModel.Status.
   * @param actual the PetModel.Status we want to make assertions on.
   */
  public PetModelStatusAssert(PetModel.Status actual) {
    super(actual, PetModelStatusAssert.class);
  }

  /**
   * An entry point for PetModelStatusAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myPetModel.Status)</code> and get specific assertion with code completion.
   * @param actual the PetModel.Status we want to make assertions on.
   * @return a new <code>{@link PetModelStatusAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static PetModelStatusAssert assertThat(PetModel.Status actual) {
    return new PetModelStatusAssert(actual);
  }
}
