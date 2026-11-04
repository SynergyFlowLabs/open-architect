package com.facebook.appevents;

import android.content.Context;
import com.facebook.internal.e1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f98867a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f98868b = g.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f98869c = "AppEventsLogger.persistedevents";

    private static final class a extends ObjectInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0902a f98870a = new C0902a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final String f98871b = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final String f98872c = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";

        /* JADX INFO: renamed from: com.facebook.appevents.g$a$a, reason: collision with other inner class name */
        public static final class C0902a {
            public /* synthetic */ C0902a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0902a() {
            }
        }

        public a(@Nullable InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        @NotNull
        protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), f98871b)) {
                resultClassDescriptor = ObjectStreamClass.lookup(com.facebook.appevents.a.b.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), f98872c)) {
                resultClassDescriptor = ObjectStreamClass.lookup(e.b.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    private g() {
    }

    @oj.n
    @NotNull
    public static final synchronized g0 a() {
        g0 g0Var;
        a aVar;
        Throwable th2;
        File fileStreamPath;
        try {
            com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
            com.facebook.appevents.internal.g.b();
            com.facebook.g0 g0Var2 = com.facebook.g0.f99617a;
            Context contextN = com.facebook.g0.n();
            g0Var = null;
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = contextN.openFileInput(f98869c);
                    Intrinsics.checkNotNullExpressionValue(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    aVar = new a(new BufferedInputStream(fileInputStreamOpenFileInput));
                    try {
                        Object object = aVar.readObject();
                        if (object == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                        }
                        g0 g0Var3 = (g0) object;
                        e1 e1Var = e1.f99794a;
                        e1.j(aVar);
                        try {
                            contextN.getFileStreamPath(f98869c).delete();
                        } catch (Exception unused) {
                        }
                        g0Var = g0Var3;
                        if (g0Var == null) {
                            g0Var = new g0();
                        }
                    } catch (FileNotFoundException unused2) {
                        e1 e1Var2 = e1.f99794a;
                        e1.j(aVar);
                        fileStreamPath = contextN.getFileStreamPath(f98869c);
                        fileStreamPath.delete();
                    } catch (Exception unused3) {
                        e1 e1Var3 = e1.f99794a;
                        e1.j(aVar);
                        fileStreamPath = contextN.getFileStreamPath(f98869c);
                        fileStreamPath.delete();
                    } catch (Throwable th3) {
                        th2 = th3;
                        e1 e1Var4 = e1.f99794a;
                        e1.j(aVar);
                        try {
                            contextN.getFileStreamPath(f98869c).delete();
                        } catch (Exception unused4) {
                        }
                        throw th2;
                    }
                } catch (Exception unused5) {
                }
            } catch (FileNotFoundException unused6) {
                aVar = null;
            } catch (Exception unused7) {
                aVar = null;
            } catch (Throwable th4) {
                aVar = null;
                th2 = th4;
            }
        } catch (Throwable th5) {
            throw th5;
        }
        return g0Var;
    }

    @oj.n
    public static final void b(@Nullable g0 g0Var) {
        e1 e1Var;
        com.facebook.g0 g0Var2 = com.facebook.g0.f99617a;
        Context contextN = com.facebook.g0.n();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(contextN.openFileOutput(f98869c, 0)));
            try {
                objectOutputStream2.writeObject(g0Var);
                e1 e1Var2 = e1.f99794a;
                e1.j(objectOutputStream2);
            } catch (Throwable unused) {
                objectOutputStream = objectOutputStream2;
                try {
                    contextN.getFileStreamPath(f98869c).delete();
                } catch (Exception unused2) {
                } finally {
                    e1Var = e1.f99794a;
                    e1.j(objectOutputStream);
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
