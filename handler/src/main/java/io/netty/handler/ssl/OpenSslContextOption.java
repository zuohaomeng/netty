/*
 * Copyright 2021 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.ssl;

/**
 * {@link SslContextOption}s that are specific to the {@link SslProvider#OPENSSL} / {@link SslProvider#OPENSSL_REFCNT}.
 *
 * @param <T> the type of the value.
 */
public final class OpenSslContextOption<T> extends SslContextOption<T> {

    private OpenSslContextOption(String name) {
        super(name);
    }

    /**
     * If enabled heavy-operations may be offloaded from the {@link io.netty.channel.EventLoop} if possible.
     */
    public static final SslContextOption<Boolean> USE_TASKS = OpenSslContextOption.valueOf("USE_TASKS");
    /**
     * If enabled <a href="https://tools.ietf.org/html/rfc7918">TLS false start</a> will be enabled if supported.
     */
    public static final SslContextOption<Boolean> TLS_FALSE_START = OpenSslContextOption.valueOf("TLS_FALSE_START");
}
