/*
 * Copyright 2022 steve.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tp10.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author steve
 */
public class ActionSimpleTest {
    
    public ActionSimpleTest() {
    }

    @Test
    public void testSomeMethod() {
        final ActionSimple as1 = new ActionSimple("Toto");
        final Jour j1 = new Jour(1);
        as1.enrgCours(j1, 10.0F);
        
        final float value = as1.valeur(j1);
        Assertions.assertEquals(value, 10.0F,0.0F,"the value should be the same as the one registered.");
    }
    
}
