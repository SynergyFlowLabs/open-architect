package com.planner5d.library.activity.fragment.dialog.message;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.s;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.widget.textview.ButtonTextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class MessageWithImageDialog extends ContentDialog<Boolean> implements n0 {
    public static final int $stable = 8;

    @ij.a
    public f1 globalCoroutineScope;

    @ij.a
    public com.planner5d.library.interactor.g handleDeepLinkInteractor;

    @ij.a
    public y0 imageManager;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private com.planner5d.library.databinding.i f132136o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f132137p3 = new com.planner5d.library.services.bitmaploader.target.h();

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f132138q3;

    public static final class a extends com.planner5d.library.widget.bitmaptarget.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ImageView imageView) {
            super(imageView, null, null, 6, null);
            Intrinsics.checkNotNull(imageView);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
            if (!MessageWithImageDialog.this.f132138q3) {
                int i10 = 6 >> 0;
                MessageWithImageDialog.this.f132137p3.d(this);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.message.MessageWithImageDialog$setupActionButton$1$1$1", f = "MessageWithImageDialog.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMessageWithImageDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageWithImageDialog.kt\ncom/planner5d/library/activity/fragment/dialog/message/MessageWithImageDialog$setupActionButton$1$1$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,115:1\n29#2:116\n*S KotlinDebug\n*F\n+ 1 MessageWithImageDialog.kt\ncom/planner5d/library/activity/fragment/dialog/message/MessageWithImageDialog$setupActionButton$1$1$1\n*L\n105#1:116\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.inappmessaging.model.j f132141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MessageWithImageDialog f132142c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.google.firebase.inappmessaging.model.j jVar, MessageWithImageDialog messageWithImageDialog, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f132141b = jVar;
            this.f132142c = messageWithImageDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f132141b, this.f132142c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String strB;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132140a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.google.firebase.inappmessaging.model.a aVarA = this.f132141b.a();
                    if (aVarA != null && (strB = aVarA.b()) != null) {
                        MessageWithImageDialog messageWithImageDialog = this.f132142c;
                        com.planner5d.library.interactor.g handleDeepLinkInteractor$P5D_Library_release = messageWithImageDialog.getHandleDeepLinkInteractor$P5D_Library_release();
                        s sVarRequireActivity = messageWithImageDialog.requireActivity();
                        Uri uri = Uri.parse(strB);
                        this.f132140a = 1;
                        if (handleDeepLinkInteractor$P5D_Library_release.a(sVarRequireActivity, uri, this) == objL) {
                            return objL;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public MessageWithImageDialog() {
        com.planner5d.library.application.b.f142455c.a().n1(this);
    }

    private final void U() {
        Object objA = A();
        com.planner5d.library.databinding.i iVar = null;
        com.google.firebase.inappmessaging.model.j jVar = objA instanceof com.google.firebase.inappmessaging.model.j ? (com.google.firebase.inappmessaging.model.j) objA : null;
        if (jVar != null) {
            com.planner5d.library.databinding.i iVar2 = this.f132136o3;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar2 = null;
            }
            iVar2.f159098f.setText(jVar.m().c());
            com.planner5d.library.databinding.i iVar3 = this.f132136o3;
            if (iVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar3 = null;
            }
            TextView textView = iVar3.f159097e;
            com.google.firebase.inappmessaging.model.n nVarD = jVar.d();
            textView.setText(nVarD != null ? nVarD.c() : null);
            y0 imageManager$P5D_Library_release = getImageManager$P5D_Library_release();
            com.google.firebase.inappmessaging.model.g gVarI = jVar.i();
            String strC = gVarI != null ? gVarI.c() : null;
            com.planner5d.library.services.bitmaploader.target.h hVar = this.f132137p3;
            com.planner5d.library.databinding.i iVar4 = this.f132136o3;
            if (iVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                iVar = iVar4;
            }
            imageManager$P5D_Library_release.b(strC, 0, 0, hVar.c(new a(iVar.f159096d)), 4L);
            X(jVar);
        }
    }

    private final void V() {
        com.planner5d.library.databinding.i iVar = this.f132136o3;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        iVar.f159094b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageWithImageDialog.W(this.f132153a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(MessageWithImageDialog messageWithImageDialog, View view) {
        messageWithImageDialog.dismiss();
    }

    private final void X(final com.google.firebase.inappmessaging.model.j jVar) {
        com.google.firebase.inappmessaging.model.d dVarC;
        com.google.firebase.inappmessaging.model.n nVarC;
        com.planner5d.library.databinding.i iVar = this.f132136o3;
        String strC = null;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        ButtonTextView buttonTextView = iVar.f159095c;
        com.google.firebase.inappmessaging.model.a aVarA = jVar.a();
        if (aVarA != null && (dVarC = aVarA.c()) != null && (nVarC = dVarC.c()) != null) {
            strC = nVarC.c();
        }
        buttonTextView.setText(strC);
        buttonTextView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageWithImageDialog.Y(this.f132154a, jVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(MessageWithImageDialog messageWithImageDialog, com.google.firebase.inappmessaging.model.j jVar, View view) {
        messageWithImageDialog.dismiss();
        kotlinx.coroutines.k.f(messageWithImageDialog.getGlobalCoroutineScope$P5D_Library_release(), com.planner5d.library.services.utility.s.f229729a.a(), null, new b(jVar, messageWithImageDialog, null), 2, null);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        com.planner5d.library.databinding.i iVarD = com.planner5d.library.databinding.i.d(LayoutInflater.from(root.getContext()), root, false);
        this.f132136o3 = iVarD;
        if (iVarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVarD = null;
        }
        ConstraintLayout root2 = iVarD.getRoot();
        U();
        V();
        Intrinsics.checkNotNullExpressionValue(root2, "apply(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.A0;
    }

    @NotNull
    public final f1 getGlobalCoroutineScope$P5D_Library_release() {
        f1 f1Var = this.globalCoroutineScope;
        if (f1Var != null) {
            return f1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("globalCoroutineScope");
        return null;
    }

    @NotNull
    public final com.planner5d.library.interactor.g getHandleDeepLinkInteractor$P5D_Library_release() {
        com.planner5d.library.interactor.g gVar = this.handleDeepLinkInteractor;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("handleDeepLinkInteractor");
        return null;
    }

    @NotNull
    public final y0 getImageManager$P5D_Library_release() {
        y0 y0Var = this.imageManager;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.f169922n7);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f132138q3 = true;
        this.f132137p3.a();
    }

    public final void setGlobalCoroutineScope$P5D_Library_release(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<set-?>");
        this.globalCoroutineScope = f1Var;
    }

    public final void setHandleDeepLinkInteractor$P5D_Library_release(@NotNull com.planner5d.library.interactor.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.handleDeepLinkInteractor = gVar;
    }

    public final void setImageManager$P5D_Library_release(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }
}
