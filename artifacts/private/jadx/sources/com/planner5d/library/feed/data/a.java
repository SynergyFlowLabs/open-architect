package com.planner5d.library.feed.data;

import androidx.annotation.l1;
import androidx.room.i0;
import androidx.room.l;
import androidx.room.o2;
import androidx.room.x0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@l
public interface a {

    /* JADX INFO: renamed from: com.planner5d.library.feed.data.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nBlogPostDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogPostDao.kt\ncom/planner5d/library/feed/data/BlogPostDao$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1557#2:43\n1628#2,3:44\n*S KotlinDebug\n*F\n+ 1 BlogPostDao.kt\ncom/planner5d/library/feed/data/BlogPostDao$DefaultImpls\n*L\n37#1:43\n37#1:44,3\n*E\n"})
    public static final class C1552a {

        /* JADX INFO: renamed from: com.planner5d.library.feed.data.a$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.feed.data.BlogPostDao$DefaultImpls", f = "BlogPostDao.kt", i = {0, 0, 1, 1}, l = {37, 37, 38}, m = "insertOrUpdateRemovingPrevious", n = {"$this", "blogPosts", "$this", "blogPosts"}, s = {"L$0", "L$1", "L$0", "L$1"})
        static final class C1553a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f175256a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f175257b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f175258c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f175259d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f175260e;

            C1553a(kotlin.coroutines.d<? super C1553a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f175259d = obj;
                this.f175260e |= Integer.MIN_VALUE;
                return C1552a.a(null, null, this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
        
            if (r11.a(r10, r0) == r1) goto L33;
         */
        @androidx.room.o2
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object a(@org.jetbrains.annotations.NotNull com.planner5d.library.feed.data.a r10, @org.jetbrains.annotations.NotNull java.util.List<jc.a> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r12) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.feed.data.a.C1552a.a(com.planner5d.library.feed.data.a, java.util.List, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @l1(otherwise = 2)
    @i0(onConflict = 1)
    @Nullable
    Object a(@NotNull List<jc.a> list, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @x0("SELECT * FROM blog_posts ORDER BY created_at DESC")
    @Nullable
    Object b(@NotNull kotlin.coroutines.d<? super List<jc.a>> dVar);

    @x0("SELECT * FROM blog_posts WHERE content_uri LIKE '%' || :text || '%' ORDER BY created_at DESC LIMIT 1")
    @Nullable
    Object c(@NotNull String str, @NotNull kotlin.coroutines.d<? super jc.a> dVar);

    @x0("SELECT * FROM blog_posts WHERE ghost_uri LIKE '%' || :text || '%' ORDER BY created_at DESC LIMIT 1")
    @Nullable
    Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super jc.a> dVar);

    @x0("SELECT id FROM blog_posts")
    @l1(otherwise = 2)
    @Nullable
    Object e(@NotNull kotlin.coroutines.d<? super List<Integer>> dVar);

    @o2
    @Nullable
    Object f(@NotNull List<jc.a> list, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @x0("DELETE FROM blog_posts WHERE id IN (:ids)")
    @l1(otherwise = 2)
    @Nullable
    Object g(@NotNull List<Integer> list, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
