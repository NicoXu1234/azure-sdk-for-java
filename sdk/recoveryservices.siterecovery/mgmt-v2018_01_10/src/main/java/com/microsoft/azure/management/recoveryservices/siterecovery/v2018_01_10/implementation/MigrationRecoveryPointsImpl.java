/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.MigrationRecoveryPoints;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.MigrationRecoveryPoint;

class MigrationRecoveryPointsImpl extends WrapperImpl<MigrationRecoveryPointsInner> implements MigrationRecoveryPoints {
    private final RecoveryServicesManager manager;

    MigrationRecoveryPointsImpl(RecoveryServicesManager manager) {
        super(manager.inner().migrationRecoveryPoints());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private MigrationRecoveryPointImpl wrapModel(MigrationRecoveryPointInner inner) {
        return  new MigrationRecoveryPointImpl(inner, manager());
    }

    @Override
    public Observable<MigrationRecoveryPoint> listByReplicationMigrationItemsAsync(final String fabricName, final String protectionContainerName, final String migrationItemName) {
        MigrationRecoveryPointsInner client = this.inner();
        return client.listByReplicationMigrationItemsAsync(fabricName, protectionContainerName, migrationItemName)
        .flatMapIterable(new Func1<Page<MigrationRecoveryPointInner>, Iterable<MigrationRecoveryPointInner>>() {
            @Override
            public Iterable<MigrationRecoveryPointInner> call(Page<MigrationRecoveryPointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MigrationRecoveryPointInner, MigrationRecoveryPoint>() {
            @Override
            public MigrationRecoveryPoint call(MigrationRecoveryPointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<MigrationRecoveryPoint> getAsync(String fabricName, String protectionContainerName, String migrationItemName, String migrationRecoveryPointName) {
        MigrationRecoveryPointsInner client = this.inner();
        return client.getAsync(fabricName, protectionContainerName, migrationItemName, migrationRecoveryPointName)
        .map(new Func1<MigrationRecoveryPointInner, MigrationRecoveryPoint>() {
            @Override
            public MigrationRecoveryPoint call(MigrationRecoveryPointInner inner) {
                return wrapModel(inner);
            }
       });
    }

}