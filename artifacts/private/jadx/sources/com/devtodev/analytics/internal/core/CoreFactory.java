package com.devtodev.analytics.internal.core;

import android.content.Context;
import com.devtodev.analytics.internal.backend.IBackend;
import com.devtodev.analytics.internal.lifecycle.ILifecycleRepository;
import com.devtodev.analytics.internal.platform.IPlatform;
import com.devtodev.analytics.internal.storage.IDatabase;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.IResourceRepository;
import com.devtodev.analytics.internal.storage.Repository;
import com.devtodev.analytics.internal.storage.ResourceRepository;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CoreFactory implements ICoreFactory {

    @NotNull
    private final f0 abTestExperimentsRepository$delegate;

    @NotNull
    private final f0 abTestExperimentsStateRepository$delegate;

    @NotNull
    private final f0 abTestRepository$delegate;

    @NotNull
    private final f0 autoPurchasesRepository$delegate;

    @NotNull
    private final f0 backend$delegate;

    @NotNull
    private final Context context;

    @NotNull
    private final f0 currencyAccrualResourcesRepository$delegate;

    @NotNull
    private final f0 devToDevUuidRepository$delegate;

    @NotNull
    private final f0 eventRepository$delegate;

    @NotNull
    private final f0 iDatabase$delegate;

    @NotNull
    private final f0 identifiersRepository$delegate;

    @NotNull
    private final f0 levelResourceRepository$delegate;

    @NotNull
    private final f0 lifeCycle$delegate;

    @NotNull
    private final f0 messagingCategoryRepository$delegate;

    @NotNull
    private final f0 paymentMarkRepository$delegate;

    @NotNull
    private final f0 peopleCardRepository$delegate;

    @NotNull
    private final f0 platform$delegate;

    @NotNull
    private final f0 projectRepository$delegate;

    @NotNull
    private final f0 reportRepository$delegate;

    @NotNull
    private final f0 subscriptionRepository$delegate;

    @NotNull
    private final f0 toolsRepository$delegate;

    @NotNull
    private final f0 tutorialMarkRepository$delegate;

    @NotNull
    private final f0 userStorage$delegate;

    public CoreFactory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        j0 j0Var = j0.PUBLICATION;
        this.backend$delegate = g0.b(j0Var, CoreFactory$backend$2.INSTANCE);
        this.lifeCycle$delegate = g0.b(j0Var, new CoreFactory$lifeCycle$2(this));
        this.platform$delegate = g0.b(j0Var, new CoreFactory$platform$2(this));
        this.iDatabase$delegate = g0.b(j0Var, new CoreFactory$iDatabase$2(this));
        this.projectRepository$delegate = g0.b(j0Var, new CoreFactory$projectRepository$2(this));
        this.userStorage$delegate = g0.b(j0Var, new CoreFactory$userStorage$2(this));
        this.identifiersRepository$delegate = g0.b(j0Var, new CoreFactory$identifiersRepository$2(this));
        this.devToDevUuidRepository$delegate = g0.b(j0Var, new CoreFactory$devToDevUuidRepository$2(this));
        this.paymentMarkRepository$delegate = g0.b(j0Var, new CoreFactory$paymentMarkRepository$2(this));
        this.autoPurchasesRepository$delegate = g0.b(j0Var, new CoreFactory$autoPurchasesRepository$2(this));
        this.subscriptionRepository$delegate = g0.b(j0Var, new CoreFactory$subscriptionRepository$2(this));
        this.tutorialMarkRepository$delegate = g0.b(j0Var, new CoreFactory$tutorialMarkRepository$2(this));
        this.eventRepository$delegate = g0.b(j0Var, new CoreFactory$eventRepository$2(this));
        this.levelResourceRepository$delegate = g0.b(j0Var, new CoreFactory$levelResourceRepository$2(this));
        this.currencyAccrualResourcesRepository$delegate = g0.b(j0Var, new CoreFactory$currencyAccrualResourcesRepository$2(this));
        this.peopleCardRepository$delegate = g0.b(j0Var, new CoreFactory$peopleCardRepository$2(this));
        this.reportRepository$delegate = g0.b(j0Var, new CoreFactory$reportRepository$2(this));
        this.messagingCategoryRepository$delegate = g0.b(j0Var, new CoreFactory$messagingCategoryRepository$2(this));
        this.toolsRepository$delegate = g0.b(j0Var, new CoreFactory$toolsRepository$2(this));
        this.abTestRepository$delegate = g0.b(j0Var, new CoreFactory$abTestRepository$2(this));
        this.abTestExperimentsRepository$delegate = g0.b(j0Var, new CoreFactory$abTestExperimentsRepository$2(this));
        this.abTestExperimentsStateRepository$delegate = g0.b(j0Var, new CoreFactory$abTestExperimentsStateRepository$2(this));
    }

    private final IDatabase getIDatabase() {
        return (IDatabase) this.iDatabase$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IRepository getRepository(String str) {
        return new Repository(str, getIDatabase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IResourceRepository getResourceRepository(String str) {
        return new ResourceRepository(str, getIDatabase());
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getAbTestExperimentsRepository() {
        return (IRepository) this.abTestExperimentsRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getAbTestExperimentsStateRepository() {
        return (IRepository) this.abTestExperimentsStateRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getAbTestRepository() {
        return (IRepository) this.abTestRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getAutoPurchasesRepository() {
        return (IRepository) this.autoPurchasesRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IBackend getBackend() {
        return (IBackend) this.backend$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IResourceRepository getCurrencyAccrualResourcesRepository() {
        return (IResourceRepository) this.currencyAccrualResourcesRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getDevToDevUuidRepository() {
        return (IRepository) this.devToDevUuidRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getEventRepository() {
        return (IRepository) this.eventRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getIdentifiersRepository() {
        return (IRepository) this.identifiersRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IResourceRepository getLevelResourceRepository() {
        return (IResourceRepository) this.levelResourceRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public ILifecycleRepository getLifeCycle() {
        return (ILifecycleRepository) this.lifeCycle$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getMessagingCategoryRepository() {
        return (IRepository) this.messagingCategoryRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getPaymentMarkRepository() {
        return (IRepository) this.paymentMarkRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getPeopleCardRepository() {
        return (IRepository) this.peopleCardRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IPlatform getPlatform() {
        return (IPlatform) this.platform$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getProjectRepository() {
        return (IRepository) this.projectRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getReportRepository() {
        return (IRepository) this.reportRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getSubscriptionRepository() {
        return (IRepository) this.subscriptionRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getToolsRepository() {
        return (IRepository) this.toolsRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getTutorialMarkRepository() {
        return (IRepository) this.tutorialMarkRepository$delegate.getValue();
    }

    @Override // com.devtodev.analytics.internal.core.ICoreFactory
    @NotNull
    public IRepository getUserStorage() {
        return (IRepository) this.userStorage$delegate.getValue();
    }
}
