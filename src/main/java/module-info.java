/*
 * pragmatickm-all - Convenience POM to include most PragmaticKM features, not including documentation or examples.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of pragmatickm-all.
 *
 * pragmatickm-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * pragmatickm-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with pragmatickm-all.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.pragmatickm.all {
  // Direct
  requires transitive com.pragmatickm.contact.all; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-all</artifactId>
  requires transitive com.pragmatickm.password.all; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-all</artifactId>
  requires transitive com.pragmatickm.procedure.all; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-all</artifactId>
  requires transitive com.pragmatickm.task.all; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-all</artifactId>
} // TODO: Avoiding rewrite-maven-plugin-4.22.2 truncation
