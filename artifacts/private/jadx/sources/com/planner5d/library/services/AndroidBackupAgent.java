package com.planner5d.library.services;

import android.app.backup.BackupAgent;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.modules.user.user.y0;
import com.planner5d.library.modules.user.user.z0;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
public final class AndroidBackupAgent extends BackupAgent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f223946c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f223947d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f223948e = "data";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f223949a = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.services.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AndroidBackupAgent.g();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f223950b = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.services.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AndroidBackupAgent.f();
        }
    });

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.AndroidBackupAgent$onRestore$1$2$1", f = "AndroidBackupAgent.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223954a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f223956c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f223956c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AndroidBackupAgent.this.new c(this.f223956c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223954a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0 z0VarD = AndroidBackupAgent.this.d();
                id.c cVarC = this.f223956c.c();
                this.f223954a = 1;
                if (z0VarD.f(cVarC, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z0 d() {
        return (z0) this.f223950b.getValue();
    }

    private final y0 e() {
        return (y0) this.f223949a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 f() {
        return com.planner5d.library.application.b.f142455c.a().y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 g() {
        return com.planner5d.library.application.b.f142455c.a().m2();
    }

    private final void h(a aVar, ParcelFileDescriptor parcelFileDescriptor) throws JSONException, IOException {
        if (parcelFileDescriptor != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
            try {
                org.apache.commons.io.p.a1(aVar.b(), fileOutputStream, Charsets.UTF_8);
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(fileOutputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        }
    }

    @Override // android.app.backup.BackupAgent
    public void onBackup(@Nullable ParcelFileDescriptor parcelFileDescriptor, @Nullable BackupDataOutput backupDataOutput, @Nullable ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        String str = null;
        if (parcelFileDescriptor != null) {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
            try {
                String strK0 = org.apache.commons.io.p.K0(fileInputStream, Charsets.UTF_8);
                kotlin.io.c.a(fileInputStream, null);
                str = strK0;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(fileInputStream, th2);
                    throw th3;
                }
            }
        }
        a aVar = new a(e().h());
        if (!Intrinsics.areEqual(aVar.b(), str)) {
            if (backupDataOutput != null) {
                try {
                    backupDataOutput.writeEntityHeader("data", aVar.a().length());
                    byte[] bytes = aVar.a().getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    backupDataOutput.writeEntityData(bytes, aVar.a().length());
                } catch (Throwable th4) {
                    timber.log.b.f381052a.e(th4);
                }
            }
            h(aVar, parcelFileDescriptor2);
        }
        d().g();
    }

    @Override // android.app.backup.BackupAgent
    @m1
    public void onRestore(@Nullable BackupDataInput backupDataInput, int i10, @Nullable ParcelFileDescriptor parcelFileDescriptor) {
        if (backupDataInput != null) {
            while (backupDataInput.readNextHeader()) {
                if (Intrinsics.areEqual(backupDataInput.getKey(), "data")) {
                    try {
                        byte[] bArr = new byte[backupDataInput.getDataSize()];
                        backupDataInput.readEntityData(bArr, 0, backupDataInput.getDataSize());
                        a aVar = new a(new JSONObject(new String(bArr, Charsets.UTF_8)));
                        com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new c(aVar, null), 3, null);
                        h(aVar, parcelFileDescriptor);
                    } catch (Throwable th2) {
                        timber.log.b.f381052a.e(th2);
                    }
                }
            }
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final id.c f223951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f223952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f223953c;

        public a(@NotNull id.c user) throws JSONException {
            Intrinsics.checkNotNullParameter(user, "user");
            this.f223951a = user;
            this.f223952b = user.a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("user", user.f());
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.f223953c = string;
        }

        @NotNull
        public final String a() {
            return this.f223953c;
        }

        @NotNull
        public final String b() {
            return this.f223952b;
        }

        @NotNull
        public final id.c c() {
            return this.f223951a;
        }

        public a(@NotNull JSONObject json) throws JSONException {
            id.c cVar;
            Intrinsics.checkNotNullParameter(json, "json");
            if (json.has("user")) {
                JSONObject jSONObject = json.getJSONObject("user");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                cVar = new id.c(jSONObject);
            } else {
                cVar = new id.c((id.a) null);
            }
            this(cVar);
        }
    }
}
