package jc;

import android.os.Bundle;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nBlogShareData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogShareData.kt\ncom/planner5d/library/feed/model/BlogShareData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Integer f307404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f307405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f307406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f307407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f307408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f307409f;

    public b() {
    }

    @Nullable
    public final Integer a() {
        return this.f307405b;
    }

    @Nullable
    public final String b() {
        return this.f307407d;
    }

    @Nullable
    public final Integer c() {
        return this.f307404a;
    }

    @Nullable
    public final String d() {
        return this.f307409f;
    }

    @Nullable
    public final String e() {
        return this.f307408e;
    }

    @Nullable
    public final String f() {
        return this.f307406c;
    }

    public final void g(@Nullable Integer num) {
        this.f307405b = num;
    }

    public final void h(@Nullable String str) {
        this.f307407d = str;
    }

    public final void i(@Nullable Integer num) {
        this.f307404a = num;
    }

    public final void j(@Nullable String str) {
        this.f307409f = str;
    }

    public final void k(@Nullable String str) {
        this.f307408e = str;
    }

    public final void l(@Nullable String str) {
        this.f307406c = str;
    }

    @NotNull
    public final Bundle m() {
        i iVar = new i();
        Integer num = this.f307404a;
        if (num != null) {
            iVar.f(r.id, num.intValue());
        }
        Integer num2 = this.f307405b;
        if (num2 != null) {
            iVar.f(r.category, num2.intValue());
        }
        iVar.j(r.title, this.f307406c);
        iVar.j(r.contentUri, this.f307407d);
        iVar.j(r.publicUri, this.f307408e);
        iVar.j(r.imageUri, this.f307409f);
        return iVar.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Bundle bundle) {
        this();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        j jVar = new j(bundle);
        r rVar = r.id;
        if (jVar.a(rVar)) {
            this.f307404a = Integer.valueOf(jVar.c(rVar, 0));
        }
        r rVar2 = r.category;
        if (jVar.a(rVar2)) {
            this.f307405b = Integer.valueOf(jVar.c(rVar2, 0));
        }
        this.f307406c = jVar.t(r.title, null);
        this.f307407d = jVar.t(r.contentUri, null);
        this.f307408e = jVar.t(r.publicUri, null);
        this.f307409f = jVar.t(r.imageUri, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull a blogPost) {
        this();
        Intrinsics.checkNotNullParameter(blogPost, "blogPost");
        this.f307404a = Integer.valueOf(blogPost.f());
        this.f307405b = blogPost.b();
        this.f307406c = blogPost.j();
        this.f307407d = blogPost.c();
        this.f307408e = blogPost.h();
        this.f307409f = blogPost.g();
    }
}
