package uk.ac.imperial.lsds.seep.api.operator;

import uk.ac.imperial.lsds.seep.api.ConnectionType;
import uk.ac.imperial.lsds.seep.api.DataStore;
import uk.ac.imperial.lsds.seep.api.data.Schema;

public interface Connectable {
	// methods to connect operators
	public void connectTo(Operator downstreamOperator, int streamId, Schema schema);
	public void connectTo(Operator downstreamOperator, int streamId, Schema schema, ConnectionType connectionType);
	public void connectTo(Operator downstreamOperator, int streamId, Schema schema, DataStore dSrc);
	public void connectTo(Operator downstreamOperator, int streamId, Schema schema, ConnectionType connectionType, DataStore dSrc);
}