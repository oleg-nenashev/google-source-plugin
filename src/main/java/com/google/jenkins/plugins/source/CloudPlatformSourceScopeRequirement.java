/*
 * Copyright 2013 Google Inc. All Rights Reserved.
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
package com.google.jenkins.plugins.source;

import java.util.Collection;

import com.google.common.collect.ImmutableList;
import com.google.jenkins.plugins.credentials.oauth.GoogleOAuth2ScopeRequirement;

/** The required OAuth2 scopes for accessing a Google hosted repository. */
public class CloudPlatformSourceScopeRequirement
    extends GoogleOAuth2ScopeRequirement {
  /** {@inheritDoc} */
  @Override
  public Collection<String> getScopes() {
    return ImmutableList.of(
        "https://www.googleapis.com/auth/source.read_write");
  }
}