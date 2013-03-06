<p>hello from map thing</p>
<ul>
<g:each in="${myMapData}" var="info">
    <li>My ${info?.key} is ${info?.value}</li>
</g:each>
</ul>
