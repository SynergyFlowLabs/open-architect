package com.planner5d.library.contest.helper;

import android.net.Uri;
import androidx.compose.runtime.internal.w0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUriHandlerForContests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UriHandlerForContests.kt\ncom/planner5d/library/contest/helper/UriHandlerForContests\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f153311d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f153312e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f153313f = Pattern.compile("^/contests/editor/?$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f153314g = Pattern.compile("^/contests/(.+)/rendered$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f153315h = Pattern.compile("^/contests/voting/?$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f153316i = Pattern.compile("^/contests/(.+)/winner$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f153317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f153318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f153319c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f153317a = uri;
        this.f153318b = g0.c(new Function0() { // from class: com.planner5d.library.contest.helper.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.h(this.f153309a);
            }
        });
        this.f153319c = g0.c(new Function0() { // from class: com.planner5d.library.contest.helper.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.i(this.f153310a);
            }
        });
    }

    private final boolean g(Pattern pattern) {
        String path = this.f153317a.getPath();
        if (path != null) {
            return pattern.matcher(path).find();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long h(j jVar) {
        String strGroup;
        String path = jVar.f153317a.getPath();
        if (path == null) {
            return null;
        }
        Matcher matcher = f153314g.matcher(path);
        if (matcher.find() && (strGroup = matcher.group(1)) != null) {
            return StringsKt.c1(strGroup);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long i(j jVar) {
        String strGroup;
        String path = jVar.f153317a.getPath();
        if (path == null) {
            return null;
        }
        Matcher matcher = f153316i.matcher(path);
        if (matcher.find() && (strGroup = matcher.group(1)) != null) {
            return StringsKt.c1(strGroup);
        }
        return null;
    }

    @Nullable
    public final Long c() {
        return (Long) this.f153318b.getValue();
    }

    @Nullable
    public final Long d() {
        return (Long) this.f153319c.getValue();
    }

    public final boolean e() {
        Pattern PATTERN_CONTESTS_EDITOR = f153313f;
        Intrinsics.checkNotNullExpressionValue(PATTERN_CONTESTS_EDITOR, "PATTERN_CONTESTS_EDITOR");
        return g(PATTERN_CONTESTS_EDITOR);
    }

    public final boolean f() {
        Pattern PATTERN_CONTESTS_VOTING = f153315h;
        Intrinsics.checkNotNullExpressionValue(PATTERN_CONTESTS_VOTING, "PATTERN_CONTESTS_VOTING");
        return g(PATTERN_CONTESTS_VOTING);
    }
}
