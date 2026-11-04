package com.planner5d.library.uploadplan.view.dialog;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f230927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c2 f230928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ke.a f230929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b2 f230930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f230931e;

    /* JADX INFO: renamed from: com.planner5d.library.uploadplan.view.dialog.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.dialog.CheckUploadQueueHelper", f = "CheckUploadQueueHelper.kt", i = {0}, l = {23}, m = "hasPendingTasks", n = {"this"}, s = {"L$0"})
    static final class C1711a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f230933b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f230935d;

        C1711a(kotlin.coroutines.d<? super C1711a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230933b = obj;
            this.f230935d |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.application.b application, @NotNull c2 networkStateUtility, @NotNull ke.a checkUploadQueueUseCase, @NotNull b2 messageManager, @NotNull ErrorMessageParser errorMessageParser) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(checkUploadQueueUseCase, "checkUploadQueueUseCase");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        this.f230927a = application;
        this.f230928b = networkStateUtility;
        this.f230929c = checkUploadQueueUseCase;
        this.f230930d = messageManager;
        this.f230931e = errorMessageParser;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object a(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        C1711a c1711a;
        if (dVar instanceof C1711a) {
            c1711a = (C1711a) dVar;
            int i10 = c1711a.f230935d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1711a.f230935d = i10 - Integer.MIN_VALUE;
            } else {
                c1711a = new C1711a(dVar);
            }
        } else {
            c1711a = new C1711a(dVar);
        }
        Object objA = c1711a.f230933b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1711a.f230935d;
        try {
            if (i11 == 0) {
                ResultKt.m(objA);
                if (!this.f230928b.d(this.f230927a)) {
                    b2 b2Var = this.f230930d;
                    ErrorMessageException errorMessageExceptionCreateNoInternetException = ErrorMessageException.createNoInternetException();
                    Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNoInternetException, "createNoInternetException(...)");
                    b2Var.r(errorMessageExceptionCreateNoInternetException);
                    return null;
                }
                ke.a aVar = this.f230929c;
                c1711a.f230932a = this;
                c1711a.f230935d = 1;
                objA = aVar.a(c1711a);
                if (objA == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (a) c1711a.f230932a;
                ResultKt.m(objA);
            }
            return (Boolean) objA;
        } catch (Exception e10) {
            this.f230930d.r(ErrorMessageParser.parse$default(this.f230931e, e10, null, 2, null));
            return null;
        }
    }
}
