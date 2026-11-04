package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements w3.e, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w3.e f74750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final d f74751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f74752c;

    public static final class a implements w3.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.room.d f74753a;

        /* JADX INFO: renamed from: androidx.room.e$a$a, reason: collision with other inner class name */
        static final class C0737a extends kotlin.jvm.internal.l0 implements Function1<w3.d, List<? extends Pair<String, String>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0737a f74754a = new C0737a();

            C0737a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final List<Pair<String, String>> invoke(@NotNull w3.d obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.X1();
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function1<w3.d, Integer> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f74755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f74756b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object[] f74757c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, String str2, Object[] objArr) {
                super(1);
                this.f74755a = str;
                this.f74756b = str2;
                this.f74757c = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Integer.valueOf(db2.N1(this.f74755a, this.f74756b, this.f74757c));
            }
        }

        static final class c extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f74758a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str) {
                super(1);
                this.f74758a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.X8(this.f74758a);
                int i10 = 5 ^ 0;
                return null;
            }
        }

        static final class d extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f74759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object[] f74760b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str, Object[] objArr) {
                super(1);
                this.f74759a = str;
                this.f74760b = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.da(this.f74759a, this.f74760b);
                return null;
            }
        }

        /* JADX INFO: renamed from: androidx.room.e$a$e, reason: collision with other inner class name */
        /* synthetic */ class C0738e extends kotlin.jvm.internal.g0 implements Function1<w3.d, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0738e f74761a = new C0738e();

            C0738e() {
                super(1, w3.d.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull w3.d p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return Boolean.valueOf(p10.pe());
            }
        }

        static final class f extends kotlin.jvm.internal.l0 implements Function1<w3.d, Long> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f74762a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f74763b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContentValues f74764c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(String str, int i10, ContentValues contentValues) {
                super(1);
                this.f74762a = str;
                this.f74763b = i10;
                this.f74764c = contentValues;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Long invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Long.valueOf(db2.f7(this.f74762a, this.f74763b, this.f74764c));
            }
        }

        static final class g extends kotlin.jvm.internal.l0 implements Function1<w3.d, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f74765a = new g();

            g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull w3.d obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Boolean.valueOf(obj.b9());
            }
        }

        static final class i extends kotlin.jvm.internal.l0 implements Function1<w3.d, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f74767a = new i();

            i() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull w3.d obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Boolean.valueOf(obj.z1());
            }
        }

        static final class j extends kotlin.jvm.internal.l0 implements Function1<w3.d, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f74768a = new j();

            j() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Boolean.valueOf(db2.Ge());
            }
        }

        static final class l extends kotlin.jvm.internal.l0 implements Function1<w3.d, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f74770a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(int i10) {
                super(1);
                this.f74770a = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Boolean.valueOf(db2.U3(this.f74770a));
            }
        }

        static final class n extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f74772a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(long j10) {
                super(1);
                this.f74772a = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.Ue(this.f74772a);
                return null;
            }
        }

        static final class o extends kotlin.jvm.internal.l0 implements Function1<w3.d, String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final o f74773a = new o();

            o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final String invoke(@NotNull w3.d obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.S();
            }
        }

        static final class p extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final p f74774a = new p();

            p() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull w3.d it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        }

        static final class q extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f74775a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(boolean z10) {
                super(1);
                this.f74775a = z10;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.C6(this.f74775a);
                return null;
            }
        }

        static final class r extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Locale f74776a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(Locale locale) {
                super(1);
                this.f74776a = locale;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.setLocale(this.f74776a);
                return null;
            }
        }

        static final class s extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f74777a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            s(int i10) {
                super(1);
                this.f74777a = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.Je(this.f74777a);
                return null;
            }
        }

        static final class t extends kotlin.jvm.internal.l0 implements Function1<w3.d, Long> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f74778a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            t(long j10) {
                super(1);
                this.f74778a = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Long invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Long.valueOf(db2.fa(this.f74778a));
            }
        }

        static final class u extends kotlin.jvm.internal.l0 implements Function1<w3.d, Integer> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f74779a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f74780b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContentValues f74781c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f74782d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object[] f74783e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            u(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f74779a = str;
                this.f74780b = i10;
                this.f74781c = contentValues;
                this.f74782d = str2;
                this.f74783e = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Integer.valueOf(db2.od(this.f74779a, this.f74780b, this.f74781c, this.f74782d, this.f74783e));
            }
        }

        static final class w extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f74785a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w(int i10) {
                super(1);
                this.f74785a = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.kc(this.f74785a);
                return null;
            }
        }

        /* synthetic */ class x extends kotlin.jvm.internal.g0 implements Function1<w3.d, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final x f74786a = new x();

            x() {
                super(1, w3.d.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull w3.d p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return Boolean.valueOf(p10.wd());
            }
        }

        /* synthetic */ class y extends kotlin.jvm.internal.g0 implements Function1<w3.d, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final y f74787a = new y();

            y() {
                super(1, w3.d.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull w3.d p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return Boolean.valueOf(p10.wd());
            }
        }

        public a(@NotNull androidx.room.d autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f74753a = autoCloser;
        }

        @Override // w3.d
        @NotNull
        public Cursor C5(@NotNull String query, @NotNull Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            try {
                return new c(this.f74753a.n().C5(query, bindArgs), this.f74753a);
            } catch (Throwable th2) {
                this.f74753a.e();
                throw th2;
            }
        }

        @Override // w3.d
        @androidx.annotation.w0(api = 16)
        public void C6(boolean z10) {
            this.f74753a.g(new q(z10));
        }

        @Override // w3.d
        public boolean E3() {
            if (this.f74753a.h() == null) {
                return false;
            }
            return ((Boolean) this.f74753a.g(new kotlin.jvm.internal.e1() { // from class: androidx.room.e.a.h
                @Override // kotlin.jvm.internal.e1, kotlin.reflect.q
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Boolean.valueOf(((w3.d) obj).E3());
                }
            })).booleanValue();
        }

        @Override // w3.d
        public void Ea() {
            if (this.f74753a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                w3.d dVarH = this.f74753a.h();
                Intrinsics.checkNotNull(dVarH);
                dVarH.Ea();
                this.f74753a.e();
            } catch (Throwable th2) {
                this.f74753a.e();
                throw th2;
            }
        }

        @Override // w3.d
        @androidx.annotation.w0(api = 16)
        public boolean Ge() {
            return ((Boolean) this.f74753a.g(j.f74768a)).booleanValue();
        }

        @Override // w3.d
        public long J6() {
            return ((Number) this.f74753a.g(new kotlin.jvm.internal.e1() { // from class: androidx.room.e.a.k
                @Override // kotlin.jvm.internal.e1, kotlin.reflect.q
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Long.valueOf(((w3.d) obj).J6());
                }
            })).longValue();
        }

        @Override // w3.d
        public void Je(int i10) {
            this.f74753a.g(new s(i10));
        }

        @Override // w3.d
        public int N1(@NotNull String table, @Nullable String str, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            return ((Number) this.f74753a.g(new b(table, str, objArr))).intValue();
        }

        @Override // w3.d
        public void Q1() {
            try {
                this.f74753a.n().Q1();
            } catch (Throwable th2) {
                this.f74753a.e();
                throw th2;
            }
        }

        @Override // w3.d
        @Nullable
        public String S() {
            return (String) this.f74753a.g(o.f74773a);
        }

        @Override // w3.d
        public boolean U3(int i10) {
            return ((Boolean) this.f74753a.g(new l(i10))).booleanValue();
        }

        @Override // w3.d
        public void Ue(long j10) {
            this.f74753a.g(new n(j10));
        }

        @Override // w3.d
        public boolean V9() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // w3.d
        public void W9() {
            Unit unit;
            w3.d dVarH = this.f74753a.h();
            if (dVarH != null) {
                dVarH.W9();
                unit = Unit.f312394a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // w3.d
        @Nullable
        public List<Pair<String, String>> X1() {
            return (List) this.f74753a.g(C0737a.f74754a);
        }

        @Override // w3.d
        public void X8(@NotNull String sql) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f74753a.g(new c(sql));
        }

        @Override // w3.d
        public void Y1() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        public final void a() {
            this.f74753a.g(p.f74774a);
        }

        @Override // w3.d
        public boolean b9() {
            return ((Boolean) this.f74753a.g(g.f74765a)).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f74753a.d();
        }

        @Override // w3.d
        public void da(@NotNull String sql, @NotNull Object[] bindArgs) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.f74753a.g(new d(sql, bindArgs));
        }

        @Override // w3.d
        public long f7(@NotNull String table, int i10, @NotNull ContentValues values) throws SQLException {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f74753a.g(new f(table, i10, values))).longValue();
        }

        @Override // w3.d
        public long fa(long j10) {
            return ((Number) this.f74753a.g(new t(j10))).longValue();
        }

        @Override // w3.d
        public int getVersion() {
            return ((Number) this.f74753a.g(new kotlin.jvm.internal.v0() { // from class: androidx.room.e.a.v
                @Override // kotlin.jvm.internal.v0, kotlin.reflect.q
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Integer.valueOf(((w3.d) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.l
                public void set(@Nullable Object obj, @Nullable Object obj2) {
                    ((w3.d) obj).kc(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // w3.d
        public boolean hc(long j10) {
            return ((Boolean) this.f74753a.g(y.f74787a)).booleanValue();
        }

        @Override // w3.d
        public void he(@NotNull SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.f74753a.n().he(transactionListener);
            } catch (Throwable th2) {
                this.f74753a.e();
                throw th2;
            }
        }

        @Override // w3.d
        public boolean isOpen() {
            w3.d dVarH = this.f74753a.h();
            if (dVarH == null) {
                return false;
            }
            return dVarH.isOpen();
        }

        @Override // w3.d
        public void j3() {
            try {
                this.f74753a.n().j3();
            } catch (Throwable th2) {
                this.f74753a.e();
                throw th2;
            }
        }

        @Override // w3.d
        public void kc(int i10) {
            this.f74753a.g(new w(i10));
        }

        @Override // w3.d
        public int od(@NotNull String table, int i10, @NotNull ContentValues values, @Nullable String str, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f74753a.g(new u(table, i10, values, str, objArr))).intValue();
        }

        @Override // w3.d
        public boolean pe() {
            if (this.f74753a.h() == null) {
                return false;
            }
            return ((Boolean) this.f74753a.g(C0738e.f74761a)).booleanValue();
        }

        @Override // w3.d
        @NotNull
        public Cursor qf(@NotNull w3.g query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f74753a.n().qf(query), this.f74753a);
            } catch (Throwable th2) {
                this.f74753a.e();
                throw th2;
            }
        }

        @Override // w3.d
        public void setLocale(@NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.f74753a.g(new r(locale));
        }

        @Override // w3.d
        public long t1() {
            return ((Number) this.f74753a.g(new kotlin.jvm.internal.v0() { // from class: androidx.room.e.a.m
                @Override // kotlin.jvm.internal.v0, kotlin.reflect.q
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Long.valueOf(((w3.d) obj).t1());
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.l
                public void set(@Nullable Object obj, @Nullable Object obj2) {
                    ((w3.d) obj).Ue(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // w3.d
        @androidx.annotation.w0(api = 24)
        @NotNull
        public Cursor u4(@NotNull w3.g query, @Nullable CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f74753a.n().u4(query, cancellationSignal), this.f74753a);
            } catch (Throwable th2) {
                this.f74753a.e();
                throw th2;
            }
        }

        @Override // w3.d
        public void ua(@NotNull SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.f74753a.n().ua(transactionListener);
            } catch (Throwable th2) {
                this.f74753a.e();
                throw th2;
            }
        }

        @Override // w3.d
        @NotNull
        public w3.i uc(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.f74753a);
        }

        @Override // w3.d
        public boolean wd() {
            return ((Boolean) this.f74753a.g(x.f74786a)).booleanValue();
        }

        @Override // w3.d
        @NotNull
        public Cursor yd(@NotNull String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f74753a.n().yd(query), this.f74753a);
            } catch (Throwable th2) {
                this.f74753a.e();
                throw th2;
            }
        }

        @Override // w3.d
        public boolean z1() {
            return ((Boolean) this.f74753a.g(i.f74767a)).booleanValue();
        }
    }

    @SourceDebugExtension({"SMAP\nAutoClosingRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,571:1\n1864#2,3:572\n*S KotlinDebug\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n*L\n478#1:572,3\n*E\n"})
    private static final class b implements w3.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f74788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.room.d f74789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList<Object> f74790c;

        static final class a extends kotlin.jvm.internal.l0 implements Function1<w3.i, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f74791a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull w3.i statement) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                statement.execute();
                return null;
            }
        }

        /* JADX INFO: renamed from: androidx.room.e$b$b, reason: collision with other inner class name */
        static final class C0739b extends kotlin.jvm.internal.l0 implements Function1<w3.i, Long> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0739b f74792a = new C0739b();

            C0739b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Long invoke(@NotNull w3.i obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.Yb());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        static final class c<T> extends kotlin.jvm.internal.l0 implements Function1<w3.d, T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<w3.i, T> f74794b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(Function1<? super w3.i, ? extends T> function1) {
                super(1);
                this.f74794b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final T invoke(@NotNull w3.d db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                w3.i iVarUc = db2.uc(b.this.f74788a);
                b.this.c(iVarUc);
                return this.f74794b.invoke(iVarUc);
            }
        }

        static final class d extends kotlin.jvm.internal.l0 implements Function1<w3.i, Integer> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f74795a = new d();

            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@NotNull w3.i obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Integer.valueOf(obj.j2());
            }
        }

        /* JADX INFO: renamed from: androidx.room.e$b$e, reason: collision with other inner class name */
        static final class C0740e extends kotlin.jvm.internal.l0 implements Function1<w3.i, Long> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0740e f74796a = new C0740e();

            C0740e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Long invoke(@NotNull w3.i obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.B5());
            }
        }

        static final class f extends kotlin.jvm.internal.l0 implements Function1<w3.i, String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f74797a = new f();

            f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final String invoke(@NotNull w3.i obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.ra();
            }
        }

        public b(@NotNull String sql, @NotNull androidx.room.d autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f74788a = sql;
            this.f74789b = autoCloser;
            this.f74790c = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(w3.i iVar) {
            Iterator<T> it = this.f74790c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.f74790c.get(i10);
                if (obj == null) {
                    iVar.J7(i11);
                } else if (obj instanceof Long) {
                    iVar.G6(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    iVar.s9(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    iVar.H5(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    iVar.Q6(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final <T> T d(Function1<? super w3.i, ? extends T> function1) {
            return (T) this.f74789b.g(new c(function1));
        }

        private final void e(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f74790c.size() && (size = this.f74790c.size()) <= i11) {
                while (true) {
                    this.f74790c.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f74790c.set(i11, obj);
        }

        @Override // w3.i
        public long B5() {
            return ((Number) d(C0740e.f74796a)).longValue();
        }

        @Override // w3.f
        public void G6(int i10, long j10) {
            e(i10, Long.valueOf(j10));
        }

        @Override // w3.f
        public void H5(int i10, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e(i10, value);
        }

        @Override // w3.f
        public void J7(int i10) {
            e(i10, null);
        }

        @Override // w3.f
        public void Q6(int i10, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e(i10, value);
        }

        @Override // w3.f
        public void Ve() {
            this.f74790c.clear();
        }

        @Override // w3.i
        public long Yb() {
            return ((Number) d(C0739b.f74792a)).longValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // w3.i
        public void execute() {
            d(a.f74791a);
        }

        @Override // w3.i
        public int j2() {
            return ((Number) d(d.f74795a)).intValue();
        }

        @Override // w3.i
        @Nullable
        public String ra() {
            return (String) d(f.f74797a);
        }

        @Override // w3.f
        public void s9(int i10, double d10) {
            e(i10, Double.valueOf(d10));
        }
    }

    private static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Cursor f74798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final d f74799b;

        public c(@NotNull Cursor delegate, @NotNull d autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f74798a = delegate;
            this.f74799b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f74798a.close();
            this.f74799b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f74798a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @kotlin.l(message = "Deprecated in Java")
        public void deactivate() {
            this.f74798a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f74798a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f74798a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f74798a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f74798a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f74798a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f74798a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f74798a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f74798a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f74798a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f74798a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f74798a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f74798a.getLong(i10);
        }

        @Override // android.database.Cursor
        @androidx.annotation.w0(api = 19)
        @NotNull
        public Uri getNotificationUri() {
            return w3.c.b.a(this.f74798a);
        }

        @Override // android.database.Cursor
        @androidx.annotation.w0(api = 29)
        @NotNull
        public List<Uri> getNotificationUris() {
            return w3.c.e.a(this.f74798a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f74798a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f74798a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f74798a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f74798a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f74798a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f74798a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f74798a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f74798a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f74798a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f74798a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f74798a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f74798a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f74798a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f74798a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f74798a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f74798a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f74798a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f74798a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f74798a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @kotlin.l(message = "Deprecated in Java")
        public boolean requery() {
            return this.f74798a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f74798a.respond(bundle);
        }

        @Override // android.database.Cursor
        @androidx.annotation.w0(api = 23)
        public void setExtras(@NotNull Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            w3.c.d.a(this.f74798a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f74798a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        @androidx.annotation.w0(api = 29)
        public void setNotificationUris(@NotNull ContentResolver cr, @NotNull List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            w3.c.e.b(this.f74798a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f74798a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f74798a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public e(@NotNull w3.e delegate, @NotNull d autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f74750a = delegate;
        this.f74751b = autoCloser;
        autoCloser.o(e());
        this.f74752c = new a(autoCloser);
    }

    @Override // w3.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f74752c.close();
    }

    @Override // androidx.room.p
    @NotNull
    public w3.e e() {
        return this.f74750a;
    }

    @Override // w3.e
    @Nullable
    public String getDatabaseName() {
        return this.f74750a.getDatabaseName();
    }

    @Override // w3.e
    @androidx.annotation.w0(api = 24)
    @NotNull
    public w3.d getReadableDatabase() {
        this.f74752c.a();
        return this.f74752c;
    }

    @Override // w3.e
    @androidx.annotation.w0(api = 24)
    @NotNull
    public w3.d getWritableDatabase() {
        this.f74752c.a();
        return this.f74752c;
    }

    @Override // w3.e
    @androidx.annotation.w0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f74750a.setWriteAheadLoggingEnabled(z10);
    }
}
