/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bigfs.internode.message;





/**
 * IMessageHandler provides the method that all message handlers need to implement.
 * The concrete implementation of this interface would provide the functionality
 * for a given message.
 */

public interface IMessageHandler<T extends IMessage>
{
    /**
     * This method delivers a message to the implementing class (if the implementing
     * class was registered by a call to MessagingService.registerVerbHandlers).
     * Note that the caller should not be holding any locks when calling this method
     * because the implementation may be synchronized.
     *
     * @param message - incoming message that needs handling.
     * @param id
     */
    public void processMessage(MessageIn<T> message);

	
}
