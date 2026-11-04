package com.superwall.sdk.debug.localizations;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SearchView;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.superwall.sdk.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SWLocalizationActivity extends d implements SearchView.OnQueryTextListener {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static Function1<? super String, Unit> completion;
    private LocalizationAdapter adapter;
    private LocalizationManager localizationManager;
    private RecyclerView recyclerView;
    private SearchView searchView;

    @NotNull
    private final f0 allRowModels$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.debug.localizations.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SWLocalizationActivity.allRowModels_delegate$lambda$0(this.f267416a);
        }
    });

    @NotNull
    private List<LocalizationGrouping> rowModels = CollectionsKt.emptyList();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Function1<String, Unit> getCompletion() {
            return SWLocalizationActivity.completion;
        }

        public final void setCompletion(@Nullable Function1<? super String, Unit> function1) {
            SWLocalizationActivity.completion = function1;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allRowModels_delegate$lambda$0(SWLocalizationActivity sWLocalizationActivity) {
        LocalizationManager localizationManager = sWLocalizationActivity.localizationManager;
        if (localizationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizationManager");
            localizationManager = null;
        }
        return localizationManager.getLocalizationGroupings();
    }

    private final void completion(String str) {
        Intent intent = new Intent();
        intent.putExtra("locale", str);
        setResult(-1, intent);
        finish();
    }

    private final List<LocalizationGrouping> getAllRowModels() {
        return (List) this.allRowModels$delegate.getValue();
    }

    private final void setupActionBar() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0("Localization");
        }
    }

    private final void setupRecyclerView() {
        this.adapter = new LocalizationAdapter(this.rowModels, new Function1() { // from class: com.superwall.sdk.debug.localizations.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SWLocalizationActivity.setupRecyclerView$lambda$1(this.f267415a, (String) obj);
            }
        });
        RecyclerView recyclerView = this.recyclerView;
        LocalizationAdapter localizationAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        LocalizationAdapter localizationAdapter2 = this.adapter;
        if (localizationAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            localizationAdapter = localizationAdapter2;
        }
        recyclerView2.setAdapter(localizationAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupRecyclerView$lambda$1(SWLocalizationActivity sWLocalizationActivity, String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        sWLocalizationActivity.finish();
        Function1<? super String, Unit> function1 = completion;
        if (function1 != null) {
            function1.invoke(locale);
        }
        return Unit.f312394a;
    }

    private final void setupSearchView() {
        SearchView searchView = (SearchView) findViewById(R.id.search_view);
        this.searchView = searchView;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView = null;
        }
        searchView.setOnQueryTextListener(this);
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_localization);
        this.localizationManager = new LocalizationManager();
        this.rowModels = getAllRowModels();
        this.recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        setupRecyclerView();
        setupSearchView();
        setupActionBar();
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(@Nullable String str) {
        if (str != null) {
            LocalizationManager localizationManager = this.localizationManager;
            LocalizationAdapter localizationAdapter = null;
            if (localizationManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localizationManager");
                localizationManager = null;
            }
            this.rowModels = localizationManager.localizationGroupings(str);
            LocalizationAdapter localizationAdapter2 = this.adapter;
            if (localizationAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                localizationAdapter = localizationAdapter2;
            }
            localizationAdapter.updateData(this.rowModels);
        }
        return true;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(@Nullable String str) {
        if (str == null) {
            return true;
        }
        LocalizationManager localizationManager = this.localizationManager;
        LocalizationAdapter localizationAdapter = null;
        if (localizationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localizationManager");
            localizationManager = null;
        }
        this.rowModels = localizationManager.localizationGroupings(str);
        LocalizationAdapter localizationAdapter2 = this.adapter;
        if (localizationAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            localizationAdapter = localizationAdapter2;
        }
        localizationAdapter.updateData(this.rowModels);
        return true;
    }
}
