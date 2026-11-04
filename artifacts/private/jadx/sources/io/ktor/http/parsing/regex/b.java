package io.ktor.http.parsing.regex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ji.m;
import ji.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nRegexParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegexParser.kt\nio/ktor/http/parsing/regex/RegexParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n216#2:34\n217#2:38\n1869#3:35\n1870#3:37\n1#4:36\n*S KotlinDebug\n*F\n+ 1 RegexParser.kt\nio/ktor/http/parsing/regex/RegexParser\n*L\n20#1:34\n20#1:38\n21#1:35\n21#1:37\n*E\n"})
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Regex f296070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, List<Integer>> f296071b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Regex expression, @NotNull Map<String, ? extends List<Integer>> indexes) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(indexes, "indexes");
        this.f296070a = expression;
        this.f296071b = indexes;
    }

    @Override // ji.n
    public boolean a(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f296070a.k(input);
    }

    @Override // ji.n
    @Nullable
    public m parse(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        MatchResult matchResultJ = this.f296070a.j(input);
        if (matchResultJ == null || matchResultJ.getValue().length() != input.length()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<Integer>> entry : this.f296071b.entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                ArrayList arrayList = new ArrayList();
                MatchGroup matchGroup = matchResultJ.b().get(iIntValue);
                if (matchGroup != null) {
                    arrayList.add(matchGroup.f());
                }
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put(key, arrayList);
                }
            }
        }
        return new m(linkedHashMap);
    }
}
