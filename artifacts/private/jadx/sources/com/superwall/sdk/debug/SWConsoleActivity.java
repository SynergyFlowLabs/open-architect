package com.superwall.sdk.debug;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.superwall.sdk.R;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSWConsoleViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SWConsoleViewController.kt\ncom/superwall/sdk/debug/SWConsoleActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1557#2:88\n1628#2,3:89\n*S KotlinDebug\n*F\n+ 1 SWConsoleViewController.kt\ncom/superwall/sdk/debug/SWConsoleActivity\n*L\n42#1:88\n42#1:89,3\n*E\n"})
public final class SWConsoleActivity extends androidx.appcompat.app.d {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static List<StoreProduct> products = CollectionsKt.emptyList();
    private ArrayAdapter<String> productAdapter;
    private Spinner productPicker;
    private RecyclerView tableView;
    private TableViewAdapter tableViewAdapter;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<StoreProduct> getProducts() {
            return SWConsoleActivity.products;
        }

        public final void setProducts(@NotNull List<StoreProduct> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            SWConsoleActivity.products = list;
        }

        private Companion() {
        }
    }

    private final void setupTableView() {
        RecyclerView recyclerView = this.tableView;
        TableViewAdapter tableViewAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tableView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.tableViewAdapter = new TableViewAdapter(new ArrayList(), 0);
        RecyclerView recyclerView2 = this.tableView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tableView");
            recyclerView2 = null;
        }
        TableViewAdapter tableViewAdapter2 = this.tableViewAdapter;
        if (tableViewAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tableViewAdapter");
        } else {
            tableViewAdapter = tableViewAdapter2;
        }
        recyclerView2.setAdapter(tableViewAdapter);
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_console);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0("Template Variables");
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.S(new ColorDrawable(-16777216));
        }
        this.productPicker = (Spinner) findViewById(R.id.productPicker);
        this.tableView = (RecyclerView) findViewById(R.id.console_recycler_view);
        int i10 = R.layout.spinner_item;
        List<StoreProduct> list = products;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StoreProduct) it.next()).getProductIdentifier());
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, i10, arrayList);
        this.productAdapter = arrayAdapter;
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = this.productPicker;
        Spinner spinner2 = null;
        if (spinner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productPicker");
            spinner = null;
        }
        ArrayAdapter<String> arrayAdapter2 = this.productAdapter;
        if (arrayAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productAdapter");
            arrayAdapter2 = null;
        }
        spinner.setAdapter((SpinnerAdapter) arrayAdapter2);
        Spinner spinner3 = this.productPicker;
        if (spinner3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productPicker");
        } else {
            spinner2 = spinner3;
        }
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.superwall.sdk.debug.SWConsoleActivity.onCreate.2
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int i11, long j10) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(view, "view");
                TableViewAdapter tableViewAdapter = SWConsoleActivity.this.tableViewAdapter;
                if (tableViewAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tableViewAdapter");
                    tableViewAdapter = null;
                }
                tableViewAdapter.updateData(SWConsoleActivity.Companion.getProducts().get(i11).getAttributes(), i11);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
            }
        });
        setupTableView();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_console, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != R.id.action_done) {
            return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }
}
