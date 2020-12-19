# protobuf-tutorials
Protocol Buffers Practise
<br />
## Scalar Number Types:
  float(32 bits),<br />
  double(64 bits),<br />
  int32,int64,unint32,unint64,sint32,sint64.... <br />
  string -> always be UTF-8 encoded / 7-bit ASCII encoded bytes -> for images bool repeated<br />

## Tags: 
  smallest : 1 <br />
  largest : 2**29 -1 <br />
  Reserved: 19000-19999 <br />
  1 byte space : tag(1 - 15) <br />
  2 bytes : tag(16-2047)<br />

## defaultValues: 
  bool : false <br />
  number: ( int32...)0 <br />
  string: empty <br />
  bytes: empty <br />
  enum: first-value <br />
  repeated: empty-list<br />

## Options: 
  option java_multiple_files=true; <br />
  // generate seperate Messageclass for different Messages from the same proto file <br />
  NOTE: 1. for repeated fields use add Method <--> to insert a value in list <br />
  2. for repeated fields use set Method <--> to override a index value in list <br />
  3. when we write a proto object to a file it can be read by any other programming language again <br />
  4. Proto <---> Json protobuf-java-util<br />

choco install protoc --pre<br />

protoc -I=proto --java_out=java proto/simple.proto <br />
protoc -I=proto --java_out=java proto/*.proto <br />
protoc -I= --java_out= <file/s>.proto<br />

mvn -U clean install<br />

Simple.Person.Builder builder = Simple.Person.newBuilder();<br />
