/*
 * ***************************************************************************
 *   Copyright 2014-2019 Spectra Logic Corporation. All Rights Reserved.
 *   Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 *   this file except in compliance with the License. A copy of the License is located at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file.
 *   This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *   CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *   specific language governing permissions and limitations under the License.
 * ***************************************************************************
 */

package com.spectralogic.ds3cli.util;

import com.spectralogic.ds3client.helpers.Ds3ClientHelpers;

import java.io.IOException;
import java.nio.channels.SeekableByteChannel;

public class LoggingMemoryObjectGetter implements LoggingObjectGetter {
    private final Ds3ClientHelpers.ObjectChannelBuilder objectChannelBuilder;

    public LoggingMemoryObjectGetter(final Ds3ClientHelpers.ObjectChannelBuilder objectChannelBuilder) {
        this.objectChannelBuilder = objectChannelBuilder;
    }

    @Override
    public SeekableByteChannel buildChannel(final String channelName) throws IOException {
        return objectChannelBuilder.buildChannel(channelName);
    }
}
