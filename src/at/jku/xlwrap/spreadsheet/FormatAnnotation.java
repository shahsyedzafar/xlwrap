/**
 * Copyright 2009 Andreas Langegger, andreas@langegger.at, Austria
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
package at.jku.xlwrap.spreadsheet;

import java.text.DateFormat;
import java.text.NumberFormat;

/**
 * @author dorgon
 *
 */
public interface FormatAnnotation {
	
	boolean isNumberFormat();
	boolean isDateFormat();
	
	public NumberFormat getNumberFormat();
	public DateFormat getDateFormat();
	
}
