package com.planner5d.library.widget.editor.popup.itemproperties;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.utility.f1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f257273f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f257274g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f257275h = "ImageChooserResult.png";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final af.a f257276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b2 f257277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Application f257278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f257279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Function1<? super Bitmap, Unit> f257280e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.popup.itemproperties.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.HelperImageChooserAfterRestart$getStoredBitmap$2", f = "HelperImageChooserAfterRestart.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1739b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257281a;

        C1739b(kotlin.coroutines.d<? super C1739b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C1739b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257281a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            File fileG = b.this.g();
            if (fileG != null && fileG.exists()) {
                try {
                    return BitmapFactory.decodeStream(new FileInputStream(fileG), null, null);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Bitmap> dVar) {
            return ((C1739b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.HelperImageChooserAfterRestart$request$1", f = "HelperImageChooserAfterRestart.kt", i = {}, l = {35, 37}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHelperImageChooserAfterRestart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperImageChooserAfterRestart.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/HelperImageChooserAfterRestart$request$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257283a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new c(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        
            if (r1.j(r6, r5) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f257283a
                r2 = 2
                r4 = 4
                r3 = 1
                if (r1 == 0) goto L23
                r4 = 2
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r6)     // Catch: java.lang.Exception -> L14
                goto L60
            L14:
                r6 = move-exception
                goto L57
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1e:
                kotlin.ResultKt.m(r6)     // Catch: java.lang.Exception -> L14
                r4 = 0
                goto L39
            L23:
                kotlin.ResultKt.m(r6)
                r4 = 6
                com.planner5d.library.widget.editor.popup.itemproperties.b r6 = com.planner5d.library.widget.editor.popup.itemproperties.b.this     // Catch: java.lang.Exception -> L14
                af.a r6 = com.planner5d.library.widget.editor.popup.itemproperties.b.a(r6)     // Catch: java.lang.Exception -> L14
                r4 = 4
                r5.f257283a = r3     // Catch: java.lang.Exception -> L14
                java.lang.Object r6 = r6.a(r5)     // Catch: java.lang.Exception -> L14
                r4 = 7
                if (r6 != r0) goto L39
                r4 = 3
                goto L56
            L39:
                r4 = 7
                android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch: java.lang.Exception -> L14
                com.planner5d.library.widget.editor.popup.itemproperties.b r1 = com.planner5d.library.widget.editor.popup.itemproperties.b.this     // Catch: java.lang.Exception -> L14
                kotlin.jvm.functions.Function1 r1 = com.planner5d.library.widget.editor.popup.itemproperties.b.c(r1)     // Catch: java.lang.Exception -> L14
                r4 = 4
                if (r1 == 0) goto L48
                r1.invoke(r6)     // Catch: java.lang.Exception -> L14
            L48:
                r4 = 0
                if (r6 == 0) goto L60
                com.planner5d.library.widget.editor.popup.itemproperties.b r1 = com.planner5d.library.widget.editor.popup.itemproperties.b.this     // Catch: java.lang.Exception -> L14
                r5.f257283a = r2     // Catch: java.lang.Exception -> L14
                java.lang.Object r5 = com.planner5d.library.widget.editor.popup.itemproperties.b.f(r1, r6, r5)     // Catch: java.lang.Exception -> L14
                r4 = 6
                if (r5 != r0) goto L60
            L56:
                return r0
            L57:
                com.planner5d.library.widget.editor.popup.itemproperties.b r5 = com.planner5d.library.widget.editor.popup.itemproperties.b.this
                com.planner5d.library.model.manager.b2 r5 = com.planner5d.library.widget.editor.popup.itemproperties.b.b(r5)
                r5.c(r6)
            L60:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.popup.itemproperties.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.HelperImageChooserAfterRestart$storeBitmap$2", f = "HelperImageChooserAfterRestart.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHelperImageChooserAfterRestart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperImageChooserAfterRestart.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/HelperImageChooserAfterRestart$storeBitmap$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257285a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f257287c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Bitmap bitmap, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f257287c = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new d(this.f257287c, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0038 A[EXC_TOP_SPLITTER, PHI: r4
          0x0038: PHI (r4v5 java.io.OutputStream) = (r4v4 java.io.OutputStream), (r4v9 java.io.OutputStream) binds: [B:20:0x004d, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, java.io.FileOutputStream, java.io.OutputStream] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            OutputStream outputStream;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257285a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            File fileG = b.this.g();
            if (fileG == null) {
                return Unit.f312394a;
            }
            i1.h hVar = new i1.h();
            try {
                Bitmap bitmap = this.f257287c;
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                ?? fileOutputStream = new FileOutputStream(fileG);
                hVar.f312751a = fileOutputStream;
                Unit unit = Unit.f312394a;
                bitmap.compress(compressFormat, 100, fileOutputStream);
                outputStream = (OutputStream) hVar.f312751a;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Exception unused2) {
                outputStream = (OutputStream) hVar.f312751a;
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Throwable th2) {
                OutputStream outputStream2 = (OutputStream) hVar.f312751a;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th2;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.HelperImageChooserAfterRestart$subscribe$1", f = "HelperImageChooserAfterRestart.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.C0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257288a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Bitmap, Unit> f257290c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super Bitmap, Unit> function1, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f257290c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new e(this.f257290c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257288a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b bVar = b.this;
                this.f257288a = 1;
                obj = bVar.h(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f257290c.invoke(bitmap);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public b(@NotNull af.a chooseImageAndResizeUseCase, @NotNull b2 messageManager, @NotNull Application application, @NotNull f1 globalScope) {
        Intrinsics.checkNotNullParameter(chooseImageAndResizeUseCase, "chooseImageAndResizeUseCase");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(globalScope, "globalScope");
        this.f257276a = chooseImageAndResizeUseCase;
        this.f257277b = messageManager;
        this.f257278c = application;
        this.f257279d = globalScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File g() {
        File externalFilesDir = this.f257278c.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (externalFilesDir == null) {
            return null;
        }
        return new File(externalFilesDir, f257275h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(kotlin.coroutines.d<? super Bitmap> dVar) {
        return kotlinx.coroutines.i.h(l1.c(), new C1739b(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(Bitmap bitmap, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(l1.c(), new d(bitmap, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public final void i() throws Throwable {
        kotlinx.coroutines.k.f(this.f257279d, null, null, new c(null), 3, null);
    }

    public final void k(@NotNull Function1<? super Bitmap, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.f257280e = onResult;
        kotlinx.coroutines.k.f(this.f257279d, null, null, new e(onResult, null), 3, null);
    }
}
