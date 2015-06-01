/*
 * Copyright 2000-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package views
import jquery.JQuery
import org.w3c.dom.events.KeyboardEvent

data class ValidationResult(val valid: Boolean, val message: String = "")

native
fun JQuery.keydown(callback: (KeyboardEvent) -> Unit)

native
fun JQuery.find(selector: String): JQuery

native
fun JQuery.trigger(action: String)

native
fun JQuery.accordion(params: Json): JQuery

native
fun JQuery.accordion(command: String): JQuery

native
public fun JQuery.button(command : String) : JQuery = noImpl

native
public fun JQuery.button(mode : String, param : String, value : Any?) : JQuery = noImpl

native
public fun JQuery.tabs(mode : String, param : String, value : Any?) : JQuery = noImpl

native
val navBarView: dynamic

native
val loginView: LoginView = noImpl

native
val consoleOutputView: dynamic