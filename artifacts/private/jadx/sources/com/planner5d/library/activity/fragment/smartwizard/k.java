package com.planner5d.library.activity.fragment.smartwizard;

import com.planner5d.library.activity.fragment.smartwizard.s;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class k<T extends s> implements fg.g<SmartWizardEditor2DFragment<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.facade.s> f135599a;

    public k(ij.c<com.planner5d.library.widget.editor.facade.s> cVar) {
        this.f135599a = cVar;
    }

    public static <T extends s> fg.g<SmartWizardEditor2DFragment<T>> a(ij.c<com.planner5d.library.widget.editor.facade.s> cVar) {
        return new k(cVar);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment.editorFacadeFactory")
    public static <T extends s> void b(SmartWizardEditor2DFragment<T> smartWizardEditor2DFragment, com.planner5d.library.widget.editor.facade.s sVar) {
        smartWizardEditor2DFragment.editorFacadeFactory = sVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(SmartWizardEditor2DFragment<T> smartWizardEditor2DFragment) {
        b(smartWizardEditor2DFragment, this.f135599a.get());
    }
}
