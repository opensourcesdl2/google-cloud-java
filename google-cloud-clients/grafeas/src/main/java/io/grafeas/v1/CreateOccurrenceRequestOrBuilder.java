/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface CreateOccurrenceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.CreateOccurrenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the occurrence is to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the occurrence is to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The occurrence to create.
   * </pre>
   *
   * <code>.grafeas.v1.Occurrence occurrence = 2;</code>
   */
  boolean hasOccurrence();
  /**
   *
   *
   * <pre>
   * The occurrence to create.
   * </pre>
   *
   * <code>.grafeas.v1.Occurrence occurrence = 2;</code>
   */
  io.grafeas.v1.Occurrence getOccurrence();
  /**
   *
   *
   * <pre>
   * The occurrence to create.
   * </pre>
   *
   * <code>.grafeas.v1.Occurrence occurrence = 2;</code>
   */
  io.grafeas.v1.OccurrenceOrBuilder getOccurrenceOrBuilder();
}
