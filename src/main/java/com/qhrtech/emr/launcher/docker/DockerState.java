/*
 * Copyright 2015 QHR Technologies.
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
package com.qhrtech.emr.launcher.docker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Blake Dickie
 */
public class DockerState {

    private final List<DockerContainer> containers;

    public DockerState() {
        containers = new ArrayList<>();
    }

    public List<DockerContainer> getContainers() {
        return containers;
    }

    public void addContainer( DockerContainer container ) {
        containers.add( container );
    }

    @Override
    public String toString() {
        return containers.toString();
    }

}
