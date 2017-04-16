/*
 * Copyright 2016 Anders Borg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aboru.games.checkers;

import com.aboru.games.shared.Position;

import javax.xml.stream.Location;

/**
 * Describes the contents of a location.
 *
 * @author aboru
 */
public class LocationDescriptor {

    private final Owner owner;
    private final Type type;
    private final Position position;

    /**
     * Creates a descriptor with the information needed to fully describe the area.
     *
     * @param owner     the owner of this location.
     * @param type      the type of checker at this location.
     * @param position  the position of this location.
     */
    public LocationDescriptor(final Owner owner, final Type type, final Position position) {
        this.owner = owner;
        this.type = type;
        this.position = position;
    }

    /**
     * Retrieves the owner of this location.
     *
     * @return      the owner of this location.
     */
    public Owner getOwner() {
        return this.owner;
    }

    /**
     * Retrieves the type of the checker at this location.
     *
     * @return      the type of the checker.
     */
    public Type getType() {
        return this.type;
    }

    /**
     * Retrieves the position of this location.
     *
     * @return      the position of this location.
     */
    public Position getPosition() {
        return this.position;
    }

    /**
     * Utility class to build location descriptors properly.
     */
    public static class Builder {

        private Owner owner;
        private Type type;
        private Position position;

        /**
         * Creates the resulting location description.
         *
         * @return  the resultant object.
         */
        public LocationDescriptor build() {
            return new LocationDescriptor(this.owner, this.type, this.position);
        }

        /**
         * Sets the position of the location.
         *
         * @param position  the position of the location.
         * @return          this builder.
         */
        public Builder at(final Position position) {
            this.position = position;
            return this;
        }

        /**
         * Sets the type of checker at this position.
         *
         * @param type      the type of checker at this location.
         * @return          this builder.
         */
        public Builder as(final Type type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the owner of this location.
         *
         * @param owner     the owner of this location.
         * @return          this builder.
         */
        public Builder ownedBy(final Owner owner) {
            this.owner = owner;
            return this;
        }

    }

}
