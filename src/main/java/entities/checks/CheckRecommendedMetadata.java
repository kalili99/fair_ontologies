/*
 * Copyright 2021-22 Ontology Engineering Group, Universidad Politecnica de Madrid, Spain
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package entities.checks;

import entities.Check;
import entities.Ontology;

public class CheckRecommendedMetadata extends Check {
    public CheckRecommendedMetadata(Ontology o) {
        super(o);
    }
    /**
     * This check verifies whether the detected metadata is the recommended one
     *
     * TO DO
     */
}