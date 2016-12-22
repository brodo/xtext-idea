/*
 * generated by Xtext
 */
package org.eclipse.xtext.testlanguages.backtracking.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class SimpleBeeLangTestLanguageFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(SimpleBeeLangTestLanguageFileType.INSTANCE, AbstractSimpleBeeLangTestLanguageFileType.DEFAULT_EXTENSION);
	}

}