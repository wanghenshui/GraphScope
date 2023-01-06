/**
 * Copyright 2020 Alibaba Group Holding Limited.
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
package com.alibaba.graphscope.compiler.api.exception;

public class GraphElementNotFoundException extends GraphSchemaException {
    public GraphElementNotFoundException() {
        super();
    }

    public GraphElementNotFoundException(Exception exception) {
        super(exception);
    }

    public GraphElementNotFoundException(String message) {
        super(message);
    }

    public GraphElementNotFoundException(String message, Exception exception) {
        super(message, exception);
    }
}