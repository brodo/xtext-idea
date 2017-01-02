package org.eclipse.xtext.parser.unorderedGroups.idea;

import com.google.inject.Injector;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries;
import org.eclipse.xtext.parser.unorderedGroups.idea.SimpleUnorderedGroupsTestLanguageStandaloneSetupIdea;

@SuppressWarnings("all")
public class SimpleUnorderedGroupsTestLanguageIdeaSetup implements ISetup {
  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    Injector _xblockexpression = null;
    {
      EcoreGlobalRegistries.ensureInitialized();
      _xblockexpression = new SimpleUnorderedGroupsTestLanguageStandaloneSetupIdea().createInjector();
    }
    return _xblockexpression;
  }
}
