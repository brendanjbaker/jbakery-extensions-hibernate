package org.jbakery.extensions.hibernate;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.ImplicitAnyDiscriminatorColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitAnyKeyColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitBasicColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitCollectionTableNameSource;
import org.hibernate.boot.model.naming.ImplicitDiscriminatorColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitEntityNameSource;
import org.hibernate.boot.model.naming.ImplicitForeignKeyNameSource;
import org.hibernate.boot.model.naming.ImplicitIdentifierColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitIndexColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitIndexNameSource;
import org.hibernate.boot.model.naming.ImplicitJoinColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitJoinTableNameSource;
import org.hibernate.boot.model.naming.ImplicitMapKeyColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitPrimaryKeyJoinColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitTenantIdColumnNameSource;
import org.hibernate.boot.model.naming.ImplicitUniqueKeyNameSource;

public class ImplicitNamingStrategyProhibited
	implements ImplicitNamingStrategy
{
	@Override
	public Identifier determinePrimaryTableName(ImplicitEntityNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineJoinTableName(ImplicitJoinTableNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineCollectionTableName(ImplicitCollectionTableNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineDiscriminatorColumnName(ImplicitDiscriminatorColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineTenantIdColumnName(ImplicitTenantIdColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineIdentifierColumnName(ImplicitIdentifierColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineBasicColumnName(ImplicitBasicColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineJoinColumnName(ImplicitJoinColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determinePrimaryKeyJoinColumnName(ImplicitPrimaryKeyJoinColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineAnyDiscriminatorColumnName(ImplicitAnyDiscriminatorColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineAnyKeyColumnName(ImplicitAnyKeyColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineMapKeyColumnName(ImplicitMapKeyColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineListIndexColumnName(ImplicitIndexColumnNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineForeignKeyName(ImplicitForeignKeyNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineUniqueKeyName(ImplicitUniqueKeyNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}

	@Override
	public Identifier determineIndexName(ImplicitIndexNameSource source)
	{
		throw new ImplicitNamingStrategyProhibitedException(source.toString());
	}
}
