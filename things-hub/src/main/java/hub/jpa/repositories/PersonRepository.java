/*
 * Things
 *
 * Copyright (c) 2014, Markus Binsteiner. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */

package hub.jpa.repositories;

import hub.types.dynamic.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import things.jpa.ValueRepository;

/**
 * Created by markus on 20/05/14.
 */
public interface PersonRepository extends JpaRepository<Person, String>, ValueRepository<Person, String> {
}
