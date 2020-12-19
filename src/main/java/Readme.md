Scalar Number Types:
    float(32 bits),double(64 bits),int32,int64,unint32,unint64,sint32,sint64....
    string -> always be UTF-8 encoded / 7-bit ASCII encoded 
    bytes -> for images 
    bool
    repeated

Tags:
    smallest : 1 
    largest : 2**29 -1
    Reserved: 19000-19999
    1 byte space : tag(1 - 15)
    2 bytes : tag(16-2047)

defaultValues:
    bool : false
    number: ( int32...)0
    string: empty
    bytes: empty
    enum: first-value
    repeated: empty-list

Options:
    option java_multiple_files=true; // generate seperate Messageclass for different Messages from the same proto file
NOTE:
    1. for repeated fields use add Method <--> to insert a value in list
    2. for repeated fields use set Method <--> to override a index value in list 
    3. when we write a proto object to a file it can be read by any other programming language again
    4. Proto <---> Json <artifactId>protobuf-java-util</artifactId>


[comment]: <> (Installation Commands)
choco install protoc --pre 

[comment]: <> (Protoc Commands)

protoc -I=proto --java_out=java proto/simple.proto
protoc -I=proto --java_out=java proto/*.proto
protoc -I=<input-folder-path> --java_out=<output-dir> <file/s>.proto


[comment]: <> (Build Commands)
mvn -U clean install


Simple.Person.Builder builder = Simple.Person.newBuilder();