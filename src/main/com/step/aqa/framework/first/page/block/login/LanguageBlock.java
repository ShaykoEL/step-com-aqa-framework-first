package com.step.aqa.framework.first.page.block.login;

import com.step.aqa.framework.first.page.block.BaseBlock;

public class LanguageBlock extends BaseBlock  implements HasLanuageElement, HasTitleLanguageElement{
    private LanuageElement titleLanguageElement = new LanguageElement ("selector for language");
    private TitleLanuageElement titleLanguageElement = new TitleLanguageElement ("selector for title language");
}
