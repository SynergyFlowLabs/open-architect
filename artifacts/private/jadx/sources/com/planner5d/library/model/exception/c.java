package com.planner5d.library.model.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nRawSerializableException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawSerializableException.kt\ncom/planner5d/library/model/exception/RawSerializableException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class c extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f180733a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f180734b = 1;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void a() {
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@NotNull Throwable source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String str = "Original class - " + source.getClass().getName() + ", " + source.getMessage();
        Throwable cause = source.getCause();
        super(str, cause != null ? new c(cause) : null, false, true);
        setStackTrace(source.getStackTrace());
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
